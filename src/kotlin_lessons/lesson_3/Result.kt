package kotlin_lessons.lesson_3

sealed class Result {
    class Success(val data: Int) : Result()
    class Error(val message: String) : Result()
}
