package f7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutManager;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.shortcut.ShortcutActivity;
import fd.j0;
import java.util.Objects;
import jc.w;
import uc.r;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements r<String, Boolean, Boolean, Boolean, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f29400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.k f29401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, r6.k kVar, String str) {
        super(4);
        this.f29400c = context;
        this.f29401d = kVar;
        this.f29402e = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:27:0x0106  */
    /* JADX WARN: Code duplicated, block: B:29:0x0112  */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    @Override // uc.r
    public w g(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        Intent intent;
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        j0.i(str2, "shortcutName");
        Intent intent2 = new Intent(this.f29400c, (Class<?>) ShortcutActivity.class);
        intent2.setFlags(268468224);
        intent2.setAction("shortcut");
        intent2.putExtra("mode", this.f29401d.getValue());
        intent2.putExtra(FacebookMediationAdapter.KEY_ID, this.f29402e);
        intent2.putExtra("autostart", zBooleanValue);
        intent2.putExtra("startHidden", zBooleanValue2);
        intent2.putExtra("closeOnFinish", zBooleanValue3);
        f0.b.a aVar = new f0.b.a(this.f29400c, this.f29401d.name() + '_' + str2);
        Intent[] intentArr = {intent2};
        f0.b bVar = aVar.f29191a;
        bVar.f29168d = intentArr;
        bVar.f29170f = str2;
        bVar.f29171g = str2;
        Context context = this.f29400c;
        PorterDuff.Mode mode = IconCompat.f1653k;
        Objects.requireNonNull(context);
        IconCompat iconCompatD = IconCompat.d(context.getResources(), context.getPackageName(), R.mipmap.ic_launcher);
        f0.b bVar2 = aVar.f29191a;
        bVar2.f29173i = iconCompatD;
        if (TextUtils.isEmpty(bVar2.f29170f)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        f0.b bVar3 = aVar.f29191a;
        Intent[] intentArr2 = bVar3.f29168d;
        if (intentArr2 == null || intentArr2.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        Context context2 = this.f29400c;
        int i10 = Build.VERSION.SDK_INT;
        Intent intentCreateShortcutResultIntent = i10 >= 26 ? ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).createShortcutResultIntent(bVar3.b()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        bVar3.a(intentCreateShortcutResultIntent);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f29400c, 0, intentCreateShortcutResultIntent, 67108864);
        j0.h(broadcast, "getBroadcast(\n          …MUTABLE\n                )");
        Context context3 = this.f29400c;
        IntentSender intentSender = broadcast.getIntentSender();
        if (i10 <= 31) {
            if (!((bVar3.A & 1) != 0)) {
                if (i10 >= 26) {
                    ((ShortcutManager) context3.getSystemService(ShortcutManager.class)).requestPinShortcut(bVar3.b(), intentSender);
                } else if (f0.d.a(context3)) {
                    intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    bVar3.a(intent);
                    if (intentSender == null) {
                        context3.sendBroadcast(intent);
                    } else {
                        context3.sendOrderedBroadcast(intent, null, new f0.c(intentSender), null, -1, null, null);
                    }
                }
            }
        } else if (i10 >= 26) {
            ((ShortcutManager) context3.getSystemService(ShortcutManager.class)).requestPinShortcut(bVar3.b(), intentSender);
        } else if (f0.d.a(context3)) {
            intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            bVar3.a(intent);
            if (intentSender == null) {
                context3.sendBroadcast(intent);
            } else {
                context3.sendOrderedBroadcast(intent, null, new f0.c(intentSender), null, -1, null, null);
            }
        }
        return w.f31842a;
    }
}
