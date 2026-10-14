package b5;

import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class c implements y4.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d5.b f3315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d5.b f3316b;

    public void a(int i10, Bundle bundle) {
        c5.d.f3604c.e(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            d5.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f3315a : this.f3316b;
            if (bVar == null) {
                return;
            }
            bVar.b(string, bundle2);
        }
    }
}
