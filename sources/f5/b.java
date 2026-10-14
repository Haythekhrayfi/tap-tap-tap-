package f5;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5.a0 f29244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f29246c;

    public b(h5.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f29244a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f29245b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f29246c = file;
    }

    @Override // f5.b0
    public h5.a0 a() {
        return this.f29244a;
    }

    @Override // f5.b0
    public File b() {
        return this.f29246c;
    }

    @Override // f5.b0
    public String c() {
        return this.f29245b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f29244a.equals(b0Var.a()) && this.f29245b.equals(b0Var.c()) && this.f29246c.equals(b0Var.b());
    }

    public int hashCode() {
        return ((((this.f29244a.hashCode() ^ 1000003) * 1000003) ^ this.f29245b.hashCode()) * 1000003) ^ this.f29246c.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CrashlyticsReportWithSessionId{report=");
        sbA.append(this.f29244a);
        sbA.append(", sessionId=");
        sbA.append(this.f29245b);
        sbA.append(", reportFile=");
        sbA.append(this.f29246c);
        sbA.append("}");
        return sbA.toString();
    }
}
