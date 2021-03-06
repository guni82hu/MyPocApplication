package com.example.andras.myapplication.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Andras_Nemeth on 2016. 12. 02..
 * useful source: https://www.captechconsulting.com/blogs/Android-Single-Account-Multiple-Application-Prescription
 * GenericAccountService is from BasicSyncAdapter sample app
 * authenticator: http://blog.udinic.com/2013/04/24/write-your-own-android-authenticator/
 * sso: https://www.captechconsulting.com/blogs/Android-Single-Account-Multiple-Application-Prescription
 * security issues: http://security-n-tech.blogspot.de/2011/01/security-issue-exposed-by-android.html
 */

public class AccountActivity extends AppCompatActivity {

    public static final String ACCOUNT_TYPE = "hu.andras.mypocapplication.account";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createAccount();
    }

    private void createAccount() {
        //I'm not sure that account service is necessary even if you don't want to sync
        Account account = GenericAccountService.GetAccount(ACCOUNT_TYPE);
        AccountManager accountManager = (AccountManager) getSystemService(Context.ACCOUNT_SERVICE);

        if (accountManager.addAccountExplicitly(account, null, null)) {
            //account didn't exist until now
        }
        accountManager.setUserData(account, "mypockey", "hellooooo");
    }
}
