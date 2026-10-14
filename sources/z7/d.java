package z7;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    e loadImage(String str, c cVar);

    default e loadImage(String str, c cVar, int i10) {
        return loadImage(str, cVar);
    }

    e loadImageBytes(String str, c cVar);

    default e loadImageBytes(String str, c cVar, int i10) {
        return loadImageBytes(str, cVar);
    }
}
