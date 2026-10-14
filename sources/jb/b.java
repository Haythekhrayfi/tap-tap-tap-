package jb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f31799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f31800d;

    public b(e eVar, Context context, f fVar) {
        this.f31799c = eVar;
        this.f31800d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        Intent intent;
        boolean z10;
        Uri uri = null;
        if (this.f31799c.f31804b == h.GOOGLEPLAY) {
            Context context = this.f31800d;
            String packageName = context.getPackageName();
            if (packageName != null) {
                uri = Uri.parse("https://play.google.com/store/apps/details?id=" + packageName);
            }
            intent = new Intent("android.intent.action.VIEW", uri);
            Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (it.next().packageName.equals("com.android.vending")) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                intent.setPackage("com.android.vending");
            }
        } else {
            String packageName2 = this.f31800d.getPackageName();
            if (packageName2 != null) {
                uri = Uri.parse("amzn://apps/android?p=" + packageName2);
            }
            intent = new Intent("android.intent.action.VIEW", uri);
        }
        this.f31800d.startActivity(intent);
        g.a(this.f31800d, false);
    }
}
