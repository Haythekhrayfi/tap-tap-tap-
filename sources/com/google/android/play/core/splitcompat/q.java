package com.google.android.play.core.splitcompat;

import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f12365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12366b;

    public q() {
    }

    public q(File file, String str) {
        this();
        Objects.requireNonNull(file, "Null splitFile");
        this.f12365a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f12366b = str;
    }

    public File a() {
        return this.f12365a;
    }

    public String b() {
        return this.f12366b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f12365a.equals(qVar.a()) && this.f12366b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12365a.hashCode() ^ 1000003) * 1000003) ^ this.f12366b.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f12365a);
        String str = this.f12366b;
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35 + str.length());
        j1.d.a(sb2, "SplitFileInfo{splitFile=", strValueOf, ", splitId=", str);
        sb2.append("}");
        return sb2.toString();
    }
}
