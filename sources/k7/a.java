package k7;

import android.content.Context;
import android.util.Base64;
import com.facebook.android.crypto.keychain.AndroidConceal;
import com.facebook.android.crypto.keychain.SharedPrefsBackedKeyChain;
import com.facebook.crypto.Crypto;
import com.facebook.crypto.CryptoConfig;
import com.facebook.crypto.Entity;

/* JADX INFO: loaded from: classes2.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Crypto f31911a;

    public a(Context context) {
        this.f31911a = AndroidConceal.get().createDefaultCrypto(new SharedPrefsBackedKeyChain(context, CryptoConfig.KEY_256));
    }

    @Override // k7.e
    public String a(String str, String str2) throws Exception {
        Entity entityCreate = Entity.create(str);
        return new String(this.f31911a.decrypt(Base64.decode(str2, 2), entityCreate));
    }

    @Override // k7.e
    public String b(String str, String str2) throws Exception {
        return Base64.encodeToString(this.f31911a.encrypt(str2.getBytes(), Entity.create(str)), 2);
    }

    public boolean c() {
        return this.f31911a.isAvailable();
    }
}
