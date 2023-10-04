public abstract class ShopAcc {
    private final int accNo;
    private String accNm;
    private final float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public float getCharges() {
        return charges;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public abstract void bookProduct(String items);

    public abstract float deliveryCharges();

    @Override
    public String toString() {
        return "Account Number: " + accNo + "\nAccount Name: " + accNm + "\nCharges: " + charges;
    }
}
