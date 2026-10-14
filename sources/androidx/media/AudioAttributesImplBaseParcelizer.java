package androidx.media;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2266a = aVar.k(audioAttributesImplBase.f2266a, 1);
        audioAttributesImplBase.f2267b = aVar.k(audioAttributesImplBase.f2267b, 2);
        audioAttributesImplBase.f2268c = aVar.k(audioAttributesImplBase.f2268c, 3);
        audioAttributesImplBase.f2269d = aVar.k(audioAttributesImplBase.f2269d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        Objects.requireNonNull(aVar);
        int i10 = audioAttributesImplBase.f2266a;
        aVar.p(1);
        aVar.t(i10);
        int i11 = audioAttributesImplBase.f2267b;
        aVar.p(2);
        aVar.t(i11);
        int i12 = audioAttributesImplBase.f2268c;
        aVar.p(3);
        aVar.t(i12);
        int i13 = audioAttributesImplBase.f2269d;
        aVar.p(4);
        aVar.t(i13);
    }
}
