package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import bd.c;
import bd.e;
import ch.qos.logback.core.CoreConstants;
import ed.u;
import fd.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc.k;
import kc.m;
import kc.t;
import y8.c0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String a(Uri uri, Context context) {
        ContentResolver contentResolver;
        return MimeTypeMap.getSingleton().getExtensionFromMimeType((context == null || (contentResolver = context.getContentResolver()) == null) ? null : contentResolver.getType(uri));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #2 {all -> 0x00c8, blocks: (B:27:0x008a, B:29:0x0090, B:41:0x00ba, B:47:0x00c4, B:48:0x00c7, B:33:0x0098, B:35:0x009c, B:37:0x00a6, B:39:0x00af, B:40:0x00b7, B:45:0x00c2), top: B:58:0x008a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:33:0x0098, B:35:0x009c, B:37:0x00a6, B:39:0x00af, B:40:0x00b7), top: B:54:0x0098, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: all -> 0x00c1, LOOP:0: B:34:0x009a->B:39:0x00af, LOOP_END, TryCatch #0 {all -> 0x00c1, blocks: (B:33:0x0098, B:35:0x009c, B:37:0x00a6, B:39:0x00af, B:40:0x00b7), top: B:54:0x0098, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7 A[SYNTHETIC] */
    public static final File b(Uri uri, Context context) throws IOException {
        String str;
        StringBuilder sbA;
        File file;
        FileOutputStream fileOutputStream;
        ContentResolver contentResolver;
        InputStream inputStreamOpenInputStream;
        byte[] bArr;
        Integer numValueOf;
        int columnIndex;
        j0.i(uri, "uri");
        ContentResolver contentResolver2 = context.getContentResolver();
        Cursor cursorQuery = contentResolver2 != null ? contentResolver2.query(uri, new String[]{"_display_name"}, null, null, null) : null;
        String string = (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) == -1) ? null : cursorQuery.getString(columnIndex);
        if (string == null) {
            String strA = a(uri, context);
            sbA = a.a("temp_file");
            if (strA != null) {
                str = CoreConstants.DOT + strA;
            } else {
                str = "";
            }
        } else {
            if (!u.x(string, ".", false, 2)) {
                String strA2 = a(uri, context);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(CoreConstants.DOT);
                str = strA2;
                sbA = sb2;
            }
            if (string == null) {
                return null;
            }
            file = new File(context.getExternalCacheDir(), string);
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            try {
                contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                } else {
                    inputStreamOpenInputStream = null;
                }
                try {
                    bArr = new byte[1024];
                    while (true) {
                        if (inputStreamOpenInputStream != null) {
                            numValueOf = Integer.valueOf(inputStreamOpenInputStream.read(bArr));
                        } else {
                            numValueOf = null;
                        }
                        j0.f(numValueOf);
                        if (numValueOf.intValue() != -1) {
                            fileOutputStream.flush();
                            c0.g(inputStreamOpenInputStream, null);
                            c0.g(fileOutputStream, null);
                            return file;
                        }
                        fileOutputStream.write(bArr, 0, numValueOf.intValue());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0.g(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    c0.g(fileOutputStream, th3);
                    throw th4;
                }
            }
        }
        sbA.append(str);
        string = sbA.toString();
        if (string == null) {
            return null;
        }
        file = new File(context.getExternalCacheDir(), string);
        file.createNewFile();
        fileOutputStream = new FileOutputStream(file);
        contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        } else {
            inputStreamOpenInputStream = null;
        }
        bArr = new byte[1024];
        while (true) {
            if (inputStreamOpenInputStream != null) {
                numValueOf = Integer.valueOf(inputStreamOpenInputStream.read(bArr));
            } else {
                numValueOf = null;
            }
            j0.f(numValueOf);
            if (numValueOf.intValue() != -1) {
                fileOutputStream.flush();
                c0.g(inputStreamOpenInputStream, null);
                c0.g(fileOutputStream, null);
                return file;
            }
            fileOutputStream.write(bArr, 0, numValueOf.intValue());
            throw th3;
        }
    }

    public static final List<File> c(Intent intent, Context context) {
        File fileB;
        if (intent == null) {
            return null;
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            Uri data = intent.getData();
            if (data == null || (fileB = b(data, context)) == null) {
                return null;
            }
            return k.a(fileB);
        }
        c cVarH = e.h(0, clipData.getItemCount());
        ArrayList arrayList = new ArrayList(m.j(cVarH, 10));
        kc.c0 it = cVarH.iterator();
        while (((bd.b) it).f3520e) {
            arrayList.add(clipData.getItemAt(it.a()));
        }
        ArrayList arrayList2 = new ArrayList(m.j(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ClipData.Item) it2.next()).getUri());
        }
        List listP = t.p(arrayList2);
        ArrayList arrayList3 = new ArrayList(m.j(listP, 10));
        Iterator it3 = ((ArrayList) listP).iterator();
        while (it3.hasNext()) {
            arrayList3.add(b((Uri) it3.next(), context));
        }
        return t.p(arrayList3);
    }
}
