public abstract class PrimeAcc extends ShopAcc {
    private static final boolean isPrime = true;
    private static final float deliveryCharges = 0.0f;

    public PrimeAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct(String items) {
    }

    @Override
    public float deliveryCharges() {
        return deliveryCharges;
    }
}
