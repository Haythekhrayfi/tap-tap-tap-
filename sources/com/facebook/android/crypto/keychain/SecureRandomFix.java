package com.facebook.android.crypto.keychain;

import android.os.Build;
import android.os.Process;
import defpackage.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.Provider;
import java.security.SecureRandomSpi;

/* JADX INFO: loaded from: classes.dex */
public class SecureRandomFix {
    private static final String DEV_URANDOM = "/dev/urandom";
    private static final int VERSION_CODE_JELLY_BEAN = 17;
    private static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;
    private static boolean sFixApplied;

    public static class FixException extends RuntimeException {
        public FixException(Throwable th) {
            super("Error fixing the Android's SecureRandom", th);
        }
    }

    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File URANDOM_FILE = new File(SecureRandomFix.DEV_URANDOM);
        private static final Object sLock = new Object();
        private static DataInputStream sUrandomIn;
        private static OutputStream sUrandomOut;
        private boolean mSeedAttempted;

        private DataInputStream getUrandomInputStream() {
            DataInputStream dataInputStream;
            synchronized (sLock) {
                if (sUrandomIn == null) {
                    try {
                        sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                    } catch (IOException e10) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e10);
                    }
                }
                dataInputStream = sUrandomIn;
            }
            return dataInputStream;
        }

        private OutputStream getUrandomOutputStream() {
            OutputStream outputStream;
            synchronized (sLock) {
                if (sUrandomOut == null) {
                    try {
                        sUrandomOut = new FileOutputStream(URANDOM_FILE);
                    } catch (IOException e10) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for writing", e10);
                    }
                }
                outputStream = sUrandomOut;
            }
            return outputStream;
        }

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i10) {
            byte[] bArr = new byte[i10];
            engineNextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            DataInputStream urandomInputStream;
            if (!this.mSeedAttempted) {
                engineSetSeed(SecureRandomFix.generateSeed());
            }
            try {
                synchronized (sLock) {
                    urandomInputStream = getUrandomInputStream();
                }
                synchronized (urandomInputStream) {
                    urandomInputStream.readFully(bArr);
                }
            } catch (IOException e10) {
                StringBuilder sbA = a.a("Failed to read from ");
                sbA.append(URANDOM_FILE);
                throw new SecurityException(sbA.toString(), e10);
            }
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            OutputStream urandomOutputStream;
            try {
                synchronized (sLock) {
                    urandomOutputStream = getUrandomOutputStream();
                }
                urandomOutputStream.write(bArr);
                urandomOutputStream.flush();
            } catch (Throwable unused) {
            }
            this.mSeedAttempted = true;
        }
    }

    public static class LinuxPRNGSecureRandomProvider extends Provider {
        public LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] generateSeed() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(getBuildFingerprintAndDeviceSerial());
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new SecurityException("Failed to generate seed", e10);
        }
    }

    private static byte[] getBuildFingerprintAndDeviceSerial() {
        StringBuilder sb2 = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb2.append(str);
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        if (deviceSerialNumber != null) {
            sb2.append(deviceSerialNumber);
        }
        try {
            return sb2.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    private static String getDeviceSerialNumber() {
        try {
            return (String) Build.class.getField("SERIAL").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized void tryApplyFixes() throws FixException {
        if (sFixApplied) {
            return;
        }
        try {
            tryApplyOpenSSLFix();
            tryInstallLinuxPRNGSecureRandom();
            sFixApplied = true;
        } catch (Throwable th) {
            throw new FixException(th);
        }
    }

    private static void tryApplyOpenSSLFix() {
    }

    private static void tryInstallLinuxPRNGSecureRandom() throws SecurityException {
    }
}
