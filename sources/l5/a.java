package l5;

import com.google.android.datatransport.Transformer;
import h5.a0;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i5.b f32209c = new i5.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f32210d = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32211e = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Transformer<a0, byte[]> f32212f = i5.a.f31251g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f32213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformer<a0, byte[]> f32214b;

    public a(b bVar, Transformer<a0, byte[]> transformer) {
        this.f32213a = bVar;
        this.f32214b = transformer;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
