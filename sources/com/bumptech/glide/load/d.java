package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o3.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static int a(List<ImageHeaderParser> list, InputStream inputStream, h3.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int iC = list.get(i10).c(inputStream, bVar);
                inputStream.reset();
                if (iC != -1) {
                    return iC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, InputStream inputStream, h3.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new r(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType imageTypeB = list.get(i10).b(inputStream);
                ImageHeaderParser.ImageType imageType = ImageHeaderParser.ImageType.UNKNOWN;
                inputStream.reset();
                if (imageTypeB != imageType) {
                    return imageTypeB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
