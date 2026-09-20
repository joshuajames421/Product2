public class Electronics extends Product2 {
    private String mName;
    private int mWarrantyDuration;
    private float mAnnualWarrantyCharge;
    
    
    public Electronics() {
        super();
        mName = "Default";
        mWarrantyDuration = 1;
        mAnnualWarrantyCharge = 0.0f;
        mProductId = 12345;
        mManufactureId = 0123;
        mWholeSalePrice = 25.99f;
        mMarkup = .30f;
    }
    public Electronics(String name, int warrantyDuration, float annualWarrantyCharge, int productId, int manufactureId, float wholeSalePrice, float markup) {
        super(productId, manufactureId, wholeSalePrice, markup);
        mName = name;
        mWarrantyDuration = warrantyDuration;
        mAnnualWarrantyCharge = annualWarrantyCharge;
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
    public void setElectronics(String name, int warrantyDuration, float annualWarrantyCharge, int productId, int manufactureId, float wholeSalePrice, float markup) {
        mName = name;
        mWarrantyDuration = warrantyDuration;
        mAnnualWarrantyCharge = annualWarrantyCharge;
        mProductId = productId;
        mManufactureId = manufactureId;
        mWholeSalePrice = wholeSalePrice;
        mMarkup = markup;
    }
    public float RetailPrice() {
        return super.RetailPrice() + mAnnualWarrantyCharge;
    }






}
