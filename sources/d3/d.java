package d3;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b<Object> f28633e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f28634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f28635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f28637d;

    public class a implements b<Object> {
        @Override // d3.d.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public d(String str, T t10, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f28636c = str;
        this.f28634a = t10;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f28635b = bVar;
    }

    public static <T> d<T> a(String str, T t10) {
        return new d<>(str, t10, f28633e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f28636c.equals(((d) obj).f28636c);
        }
        return false;
    }

    public int hashCode() {
        return this.f28636c.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Option{key='");
        sbA.append(this.f28636c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
