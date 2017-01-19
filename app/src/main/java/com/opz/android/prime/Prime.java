package com.opz.android.prime;

/**
 * Created by zCatchMee on 1/18/17.
 */

public class Prime {
    private String mStoreNumber;

    public String getStoreNumber(){
        return mStoreNumber;
    }

    public void setStoreNumber(String storeNumber) {
        mStoreNumber = storeNumber;
    }

    public boolean isCheckPrime() {
        int number = Integer.parseInt(mStoreNumber.toString());
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidNumber() {
        try {
            Integer.parseInt(mStoreNumber);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
