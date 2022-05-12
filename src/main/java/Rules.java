import java.util.Scanner;

public class Rules {


        public String toString () {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Зравстуй воин!\n");
            stringBuilder.append("В самом начале тебе предстоит выбрать предметы для проведения боя.\n");
            stringBuilder.append("После того как ты выбрал их тебя ждет дуэль против комьютера.\n");
            stringBuilder.append("Бой проходит в рамках текстовой игры, где каждый по очереди выбирает действие,будь то атака или защита.\n");
            stringBuilder.append("Желаю тебе успехов!\n");
            stringBuilder.append("\n");

            return stringBuilder.toString();
        }

}
