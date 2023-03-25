import org.apache.commons.io.input.TeeInputStream;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class telegrambot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
//        System.out.println(update.getMessage().getText());
        // getting the message
//        System.out.println(update.getMessage().getFrom().getFirstName());
        // getting the user that sent the message

        String command = update.getMessage().getText();
        if (command.equals("/run")) {
            String message = "Run Forrest Run!";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }
        } else if (command.equals("/walk")) {
            String message = "Take a walk! It's good for you!";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }
        } else if (command.equals("/eat")) {
            String message1 = "EAT! You Need fuel!";
            SendMessage response1 = new SendMessage();
            response1.setChatId(update.getMessage().getChatId().toString());
            response1.setText(message1);

            try {
                execute(response1);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }
        } else if (command.equals("/sleep")) {

            String message2 = "Sleep! This is vital and irrecoverable";
            SendMessage response2 = new SendMessage();
            response2.setChatId(update.getMessage().getChatId().toString());
            response2.setText(message2);

            try {
                execute(response2);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }

        } else if (command.equals("/code")) {

            String message3 = "Code! Take leverage of TECH!";
            SendMessage response3 = new SendMessage();
            response3.setChatId(update.getMessage().getChatId().toString());
            response3.setText(message3);

            try {
                execute(response3);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }

        }
    }
        @Override
        public String getBotUsername () {
            // TODO
            return "telejava1_bot";
        }

        @Override
        public String getBotToken () {
            // TODO
            return "6119887662:AAGBy4Dwo9KKjWpP8vtwA9VkTeisU7RLEIw";
        }

}

