package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Km {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context).setTitle(IN.A0X(context)).setMessage(IN.A0V(context)).setPositiveButton(IN.A0W(context), new DialogInterfaceOnClickListenerC0994Kl(onClickListener)).setNegativeButton(IN.A0U(context), new DialogInterfaceOnClickListenerC0993Kk(onClickListener2));
            builder.show();
        }
    }
}
