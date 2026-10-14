package k7;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class q implements e {
    @Override // k7.e
    public String a(String str, String str2) throws Exception {
        return new String(Base64.decode(str2, 0));
    }

    @Override // k7.e
    public String b(String str, String str2) throws Exception {
        return Base64.encodeToString(str2.getBytes(), 0);
    }
}
