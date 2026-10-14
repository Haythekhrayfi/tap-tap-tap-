package g2;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class v {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f29775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f29776d;

        static {
            int[] iArr = new int[androidx.work.g.values().length];
            f29776d = iArr;
            try {
                iArr[androidx.work.g.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29776d[androidx.work.g.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.f.values().length];
            f29775c = iArr2;
            try {
                iArr2[androidx.work.f.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29775c[androidx.work.f.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29775c[androidx.work.f.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29775c[androidx.work.f.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29775c[androidx.work.f.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f29774b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29774b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[androidx.work.h.values().length];
            f29773a = iArr4;
            try {
                iArr4[androidx.work.h.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29773a[androidx.work.h.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29773a[androidx.work.h.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29773a[androidx.work.h.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29773a[androidx.work.h.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29773a[androidx.work.h.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static x1.c a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e10;
        x1.c cVar = new x1.c();
        if (bArr == null) {
            return cVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            cVar.f37396a.add(new x1.c.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e10 = e12;
                        e10.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e16) {
                e16.printStackTrace();
            }
        } catch (IOException e17) {
            objectInputStream = null;
            e10 = e17;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
        return cVar;
    }

    public static androidx.work.a b(int i10) {
        if (i10 == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException(android.support.v4.media.j.a("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static androidx.work.f c(int i10) {
        if (i10 == 0) {
            return androidx.work.f.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return androidx.work.f.CONNECTED;
        }
        if (i10 == 2) {
            return androidx.work.f.UNMETERED;
        }
        if (i10 == 3) {
            return androidx.work.f.NOT_ROAMING;
        }
        if (i10 == 4) {
            return androidx.work.f.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(android.support.v4.media.j.a("Could not convert ", i10, " to NetworkType"));
        }
        return androidx.work.f.TEMPORARILY_UNMETERED;
    }

    public static androidx.work.g d(int i10) {
        if (i10 == 0) {
            return androidx.work.g.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return androidx.work.g.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(android.support.v4.media.j.a("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static androidx.work.h e(int i10) {
        if (i10 == 0) {
            return androidx.work.h.ENQUEUED;
        }
        if (i10 == 1) {
            return androidx.work.h.RUNNING;
        }
        if (i10 == 2) {
            return androidx.work.h.SUCCEEDED;
        }
        if (i10 == 3) {
            return androidx.work.h.FAILED;
        }
        if (i10 == 4) {
            return androidx.work.h.BLOCKED;
        }
        if (i10 == 5) {
            return androidx.work.h.CANCELLED;
        }
        throw new IllegalArgumentException(android.support.v4.media.j.a("Could not convert ", i10, " to State"));
    }

    public static int f(androidx.work.h hVar) {
        switch (a.f29773a[hVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + hVar + " to int");
        }
    }
}
