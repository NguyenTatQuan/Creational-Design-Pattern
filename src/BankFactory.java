public class BankFactory {

    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {

            case TPBANK:
                return new TPBank();

            case VCBank:
                return new VCBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }

}