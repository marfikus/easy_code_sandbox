package kotlin_lessons.lesson_8;

public class Loader implements DownloadFile.ProgressCallback {

    private final View view;
    private final String url;
    private final String fileName;

    public Loader(View view, String url, String fileName) {
        this.view = view;
        this.url = url;
        this.fileName = fileName;
    }

    public void start() {
        view.setButtonEnabled(false);
        view.showProgress(true);
        DownloadFile downloadFile = new DownloadFile(
                url,
                fileName,
                this
        );
        downloadFile.start();
    }

    @Override
    public void failed(String message) {
        view.showProgress(false);
        view.showError();
        view.setButtonEnabled(true);
        System.out.println("Downloading file failed " + message);
    }

    @Override
    public void finishedSuccessfully() {
        view.showProgress(false);
        view.setButtonEnabled(true);
    }

    interface View {

        void setButtonEnabled(boolean enabled);

        void showProgress(boolean show);

        void showError();
    }

}
