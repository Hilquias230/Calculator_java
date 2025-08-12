public enum Operators {

    SUM {
        public int execute(int firstNumber, int secondNumber) { return firstNumber + secondNumber; }
    },
    SUB {
        public int execute(int firstNumber, int secondNumber) { return firstNumber - secondNumber; }
    },
    MULTI {
        public int execute(int firstNumber, int secondNumber) { return firstNumber * secondNumber; }
    },
    DIV {
        public int execute(int firstNumber, int secondNumber) { return firstNumber / secondNumber; }
    };

    public abstract int execute (int firstNumber, int secondNumber);
}
