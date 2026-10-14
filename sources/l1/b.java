package l1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import androidx.room.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static void a(n1.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        o1.a aVar = (o1.a) bVar;
        Cursor cursorB = aVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorB.moveToNext()) {
            try {
                arrayList.add(cursorB.getString(0));
            } catch (Throwable th) {
                cursorB.close();
                throw th;
            }
        }
        cursorB.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.f33870c.execSQL(i.f.a("DROP TRIGGER IF EXISTS ", str));
            }
        }
    }

    @Deprecated
    public static Cursor b(g gVar, n1.f fVar, boolean z10) {
        return c(gVar, fVar, z10, null);
    }

    public static Cursor c(g gVar, n1.f fVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor cursorO = gVar.o(fVar, null);
        if (z10 && (cursorO instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorO;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i10 = 0; i10 < abstractWindowedCursor.getColumnCount(); i10++) {
                            int type = abstractWindowedCursor.getType(i10);
                            if (type == 0) {
                                objArr[i10] = null;
                            } else if (type == 1) {
                                objArr[i10] = Long.valueOf(abstractWindowedCursor.getLong(i10));
                            } else if (type == 2) {
                                objArr[i10] = Double.valueOf(abstractWindowedCursor.getDouble(i10));
                            } else if (type == 3) {
                                objArr[i10] = abstractWindowedCursor.getString(i10);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i10] = abstractWindowedCursor.getBlob(i10);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return cursorO;
    }

    public static int d(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            channel.close();
            return i10;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
