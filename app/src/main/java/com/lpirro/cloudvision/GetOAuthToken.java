package com.lpirro.cloudvision;

import android.accounts.Account;
import android.app.Activity;
import android.os.AsyncTask;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;

import java.io.IOException;

public class GetOAuthToken extends AsyncTask<Void, Void, Void> {
    Activity mActivity;
    Account mAccount;
    int mRequestCode;
    String mScope;

    GetOAuthToken(Activity activity, Account account, String scope, int requestCode) {
        this.mActivity = activity;
        this.mScope = scope;
        this.mAccount = account;
        this.mRequestCode = requestCode;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            String token = fetchToken();
            if (token != null) {
                ((MainActivity)mActivity).onTokenReceived(token);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected String fetchToken() throws IOException {
        System.out.println("scope hereeee");
        System.out.println(mScope);
        System.out.println("activity hereeee");
        System.out.println(mActivity.toString());
        System.out.println("account hereeee");
        System.out.println(mAccount.toString());
//        return "ya29.GlvOBnkSNEsRh5OlxoLosa4KQP6KFUb0hvZ0qvLoSsgfZukyvyQRtVfOMmaRGCqt0ekJNk9denJWQ6HqgnW_l44TGGhB4H0HRT_Ro6TicmiWRHiQm90pZEVYUQ49";
        String accessToken;
        try {
            System.out.println("Try!");
            //accessToken = GoogleAuthUtil.getToken(mActivity, mAccount, mScope);
            //GoogleAuthUtil.clearToken (mActivity, accessToken);
            accessToken = GoogleAuthUtil.getToken(mActivity, mAccount, mScope);
            return accessToken;
        } catch (UserRecoverableAuthException userRecoverableException) {
            mActivity.startActivityForResult(userRecoverableException.getIntent(), mRequestCode);
        } catch (GoogleAuthException fatalException) {
            fatalException.printStackTrace();
        }
        return null;
    }
}
