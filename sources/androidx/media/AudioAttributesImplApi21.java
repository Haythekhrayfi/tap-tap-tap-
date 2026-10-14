package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f2264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2265b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2264a.equals(((AudioAttributesImplApi21) obj).f2264a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2264a.hashCode();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AudioAttributesCompat: audioattributes=");
        sbA.append(this.f2264a);
        return sbA.toString();
    }
}
