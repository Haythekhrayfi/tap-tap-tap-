package kotlin;

import bd.c;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final a Companion = new a(null);
    public static final KotlinVersion CURRENT = new KotlinVersion(1, 7, 22);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public KotlinVersion(int i10, int i11) {
        this(i10, i11, 0);
    }

    public KotlinVersion(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.version = versionOf(i10, i11, i12);
    }

    private final int versionOf(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new c(0, 255).e(i10) && new c(0, 255).e(i11) && new c(0, 255).e(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + CoreConstants.DOT + i11 + CoreConstants.DOT + i12).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion kotlinVersion) {
        j0.i(kotlinVersion, "other");
        return this.version - kotlinVersion.version;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i10, int i11) {
        int i12 = this.major;
        return i12 > i10 || (i12 == i10 && this.minor >= i11);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13;
        int i14 = this.major;
        return i14 > i10 || (i14 == i10 && ((i13 = this.minor) > i11 || (i13 == i11 && this.patch >= i12)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.minor);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.patch);
        return sb2.toString();
    }
}
