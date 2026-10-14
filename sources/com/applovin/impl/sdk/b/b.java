package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f10296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlertDialog f10297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f10298d;

    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, o oVar) {
        this.f10295a = oVar;
        this.f10296b = activity;
    }

    public void a() {
        this.f10296b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f10297c != null) {
                    b.this.f10297c.dismiss();
                }
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.f10296b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.f10296b);
                builder.setTitle(eVar.as());
                String strAt = eVar.at();
                if (AppLovinSdkUtils.isValidString(strAt)) {
                    builder.setMessage(strAt);
                }
                builder.setPositiveButton(eVar.au(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.f10297c = builder.show();
            }
        });
    }

    public void a(a aVar) {
        this.f10298d = aVar;
    }

    public void b() {
        this.f10296b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f10297c = new AlertDialog.Builder(b.this.f10296b).setTitle((CharSequence) b.this.f10295a.a(com.applovin.impl.sdk.c.b.bO)).setMessage((CharSequence) b.this.f10295a.a(com.applovin.impl.sdk.c.b.bP)).setCancelable(false).setPositiveButton((CharSequence) b.this.f10295a.a(com.applovin.impl.sdk.c.b.bR), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f10298d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.f10295a.a(com.applovin.impl.sdk.c.b.bQ), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i10) {
                        b.this.f10298d.b();
                    }
                }).show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.f10297c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
