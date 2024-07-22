package app;

public class Main {

    public static void main(String[] args) {
        DataRepository dataRepository = new DataRepository();
        DataHandler dataHandler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        uiOperator.getOutput(dataHandler.formListOutput(dataRepository.getData()));
        uiOperator.getOutput(dataHandler.formOutput(dataRepository.getData(), 2));

    }
}
