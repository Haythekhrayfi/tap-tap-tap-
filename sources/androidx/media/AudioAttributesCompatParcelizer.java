package androidx.media;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        t1.b bVarO = audioAttributesCompat.f2263a;
        if (aVar.i(1)) {
            bVarO = aVar.o();
        }
        audioAttributesCompat.f2263a = (AudioAttributesImpl) bVarO;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2263a;
        aVar.p(1);
        aVar.w(audioAttributesImpl);
    }
}
