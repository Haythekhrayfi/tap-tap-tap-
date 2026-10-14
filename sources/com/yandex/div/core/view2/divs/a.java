package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import e9.c;
import fd.j0;
import i8.z;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import l8.v;
import q8.e;
import vc.g;
import z7.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13421e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f13422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f13424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13425d;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.a$a, reason: collision with other inner class name */
    public static final class C0168a {
        public C0168a() {
        }

        public C0168a(g gVar) {
        }
    }

    public static final class b extends AsyncTask<Void, Void, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<o8.e> f13426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z7.b f13427b;

        public b(WeakReference<o8.e> weakReference, z7.b bVar) {
            j0.i(weakReference, "view");
            j0.i(bVar, "cachedBitmap");
            this.f13426a = weakReference;
            this.f13427b = bVar;
        }

        public final Drawable a() throws IllegalStateException, IOException {
            byte[] bArr = this.f13427b.f45160c;
            if (bArr == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            o8.e eVar = this.f13426a.get();
            Context context = eVar == null ? null : eVar.getContext();
            if (context == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File fileCreateTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                j0.h(fileCreateTempFile, "tempFile");
                sc.b.b(fileCreateTempFile, bArr);
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(fileCreateTempFile);
                j0.h(sourceCreateSource, "createSource(tempFile)");
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceCreateSource);
                j0.h(drawableDecodeDrawable, "{\n                tempFi…ble(source)\n            }");
                return drawableDecodeDrawable;
            } finally {
                fileCreateTempFile.delete();
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        public Drawable doInBackground(Void[] voidArr) {
            ImageDecoder.Source sourceCreateSource;
            j0.i(voidArr, "params");
            try {
                return a();
            } catch (IOException | IllegalStateException unused) {
                c cVar = c.f29122a;
                Uri uri = this.f13427b.f45159b;
                String path = uri == null ? null : uri.getPath();
                if (path != null) {
                    try {
                        sourceCreateSource = ImageDecoder.createSource(new File(path));
                    } catch (IOException unused2) {
                        c cVar2 = c.f29122a;
                        sourceCreateSource = null;
                        if (sourceCreateSource != null) {
                            try {
                                return ImageDecoder.decodeDrawable(sourceCreateSource);
                            } catch (IOException unused3) {
                                c cVar3 = c.f29122a;
                                return null;
                            }
                        }
                        return null;
                    }
                } else {
                    c cVar4 = c.f29122a;
                    sourceCreateSource = null;
                }
                if (sourceCreateSource != null) {
                    return ImageDecoder.decodeDrawable(sourceCreateSource);
                }
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            super.onPostExecute(drawable2);
            if (drawable2 == null || !(drawable2 instanceof AnimatedImageDrawable)) {
                o8.e eVar = this.f13426a.get();
                if (eVar != null) {
                    eVar.setImage(this.f13427b.f45158a);
                }
            } else {
                o8.e eVar2 = this.f13426a.get();
                if (eVar2 != null) {
                    eVar2.setImage(drawable2);
                }
            }
            o8.e eVar3 = this.f13426a.get();
            if (eVar3 == null) {
                return;
            }
            eVar3.i();
        }
    }

    static {
        new C0168a(null);
    }

    public a(v vVar, d dVar, z zVar, e eVar) {
        j0.i(vVar, "baseBinder");
        j0.i(dVar, "imageLoader");
        j0.i(zVar, "placeholderLoader");
        j0.i(eVar, "errorCollectors");
        this.f13422a = vVar;
        this.f13423b = dVar;
        this.f13424c = zVar;
        this.f13425d = eVar;
    }
}
