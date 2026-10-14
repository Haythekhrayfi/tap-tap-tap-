package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class be extends com.google.android.play.core.internal.ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f11917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f11918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NavigableMap<Long, File> f11919c = new TreeMap();

    public be(File file, File file2) throws IOException {
        this.f11917a = file;
        this.f11918b = file2;
        List<File> listA = dt.a(file, file2);
        if (listA.isEmpty()) {
            throw new bv(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        int size = listA.size();
        long length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            File file3 = listA.get(i10);
            this.f11919c.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    private final InputStream a(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f11919c.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new bv(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }

    @Override // com.google.android.play.core.internal.ca
    public final long a() {
        Map.Entry<Long, File> entryLastEntry = this.f11919c.lastEntry();
        return entryLastEntry.getValue().length() + entryLastEntry.getKey().longValue();
    }

    @Override // com.google.android.play.core.internal.ca
    public final InputStream a(long j10, long j11) throws IOException {
        if (j10 < 0 || j11 < 0) {
            throw new bv(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j12 = j10 + j11;
        if (j12 > a()) {
            throw new bv(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j12)));
        }
        Long lFloorKey = this.f11919c.floorKey(Long.valueOf(j10));
        Long lFloorKey2 = this.f11919c.floorKey(Long.valueOf(j12));
        if (lFloorKey.equals(lFloorKey2)) {
            return new bd(a(j10, lFloorKey), j11);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(j10, lFloorKey));
        Collection<File> collectionValues = this.f11919c.subMap(lFloorKey, false, lFloorKey2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new dc(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new bd(new FileInputStream((File) this.f11919c.get(lFloorKey2)), j11 - (lFloorKey2.longValue() - j10)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
