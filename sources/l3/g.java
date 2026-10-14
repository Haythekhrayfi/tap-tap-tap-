package l3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g implements d3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f32143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f32144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f32147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f32148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32149h;

    public g(String str) {
        this(str, h.f32150a);
    }

    public g(String str, h hVar) {
        this.f32144c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f32145d = str;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f32143b = hVar;
    }

    public g(URL url) {
        this(url, h.f32150a);
    }

    @Override // d3.c
    public void a(MessageDigest messageDigest) {
        if (this.f32148g == null) {
            this.f32148g = c().getBytes(d3.c.f28632a);
        }
        messageDigest.update(this.f32148g);
    }

    public String c() {
        String str = this.f32145d;
        if (str != null) {
            return str;
        }
        URL url = this.f32144c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() throws MalformedURLException {
        if (this.f32147f == null) {
            if (TextUtils.isEmpty(this.f32146e)) {
                String string = this.f32145d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f32144c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f32146e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f32147f = new URL(this.f32146e);
        }
        return this.f32147f;
    }

    @Override // d3.c
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f32143b.equals(gVar.f32143b);
    }

    @Override // d3.c
    public int hashCode() {
        if (this.f32149h == 0) {
            int iHashCode = c().hashCode();
            this.f32149h = iHashCode;
            this.f32149h = this.f32143b.hashCode() + (iHashCode * 31);
        }
        return this.f32149h;
    }

    public String toString() {
        return c();
    }

    public g(URL url, h hVar) {
        Objects.requireNonNull(url, "Argument must not be null");
        this.f32144c = url;
        this.f32145d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f32143b = hVar;
    }
}
