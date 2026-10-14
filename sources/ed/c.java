package ed;

import fd.j0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f29138a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Charset f29140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Charset f29141d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        j0.h(charsetForName, "forName(\"UTF-8\")");
        f29139b = charsetForName;
        j0.h(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        j0.h(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        j0.h(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        j0.h(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        j0.h(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
