public abstract class NormalAcc extends ShopAcc {
    private static final boolean isPrime = false;
    private float lazyDeliveryCharges = 0.0f;

    public NormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct(String items) {
    }

    @Override
    public float deliveryCharges() {
        return lazyDeliveryCharges;
    }

    public void setLazyDeliveryCharges(float deliveryCharges) {
        this.lazyDeliveryCharges = deliveryCharges;
    }
}
