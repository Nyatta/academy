package homeworks.bitwise_2;
import java.util.Objects;

public class MessagesInput {

    public String MessagesInputIf(String name){
        String answer;
        if (Objects.equals(name, "Анастасия")){
            return answer = "Я тебя так долго ждал!";
        }
        if (Objects.equals(name, "Вася")){
            return answer = "Привет!\nЯ тебя так долго ждал.";
        }
        return answer = "А вы кто?";
    }

    public String MessagesInputIfElse(String name){
        String answer;
        if (Objects.equals(name, "Анастасия")){
            return answer = "Я тебя так долго ждал!";
        }else if (Objects.equals(name, "Вася")){
            return answer = "Привет!\nЯ тебя так долго ждал.";
        }else{
            return answer = "А вы кто?";
        }
    }

    public String MessagesInputSwitch(String name){
        String answer;
        switch (name){
            case "Анастасия":
                answer = "Я тебя так долго ждал";
                break;
            case "Вася":
                answer = "Привет!\nЯ тебя так долго ждал";
                break;
            default:
                answer = "А вы кто?";
        }
        return answer;
    }



}
