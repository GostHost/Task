public class TaskFromJavaRush17 {
    //5. Мама Мыла Раму. Теперь с большой буквы
    //Написать программу, которая вводит с клавиатуры строку текста.
    //Программа заменяет в тексте первые буквы всех слов на заглавные.
    //Вывести результат на экран.
    //Пример ввода:
    //мама мыла раму.
    //Пример вывода:
    //Мама Мыла Раму.
    public static void main(String[] args) {
        TaskFromJavaRush17 task = new TaskFromJavaRush17();
        task.upperSymbol("мама мыла раму");

    }
    public String upperSymbol (String str){
        String upp = "";
        String [] split = str.split(" ");
        for(String s : split){
            upp = s.substring(0,1).toUpperCase() + s.substring(1);
            System.out.print(upp + " ");
        }
        return upp;
    }
}
