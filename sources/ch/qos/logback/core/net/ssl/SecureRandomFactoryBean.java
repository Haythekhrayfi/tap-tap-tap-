package ch.qos.logback.core.net.ssl;

import defpackage.a;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class SecureRandomFactoryBean {
    private String algorithm;
    private String provider;

    public SecureRandom createSecureRandom() throws NoSuchAlgorithmException, NoSuchProviderException {
        try {
            return getProvider() != null ? SecureRandom.getInstance(getAlgorithm(), getProvider()) : SecureRandom.getInstance(getAlgorithm());
        } catch (NoSuchAlgorithmException unused) {
            StringBuilder sbA = a.a("no such secure random algorithm: ");
            sbA.append(getAlgorithm());
            throw new NoSuchAlgorithmException(sbA.toString());
        } catch (NoSuchProviderException unused2) {
            StringBuilder sbA2 = a.a("no such secure random provider: ");
            sbA2.append(getProvider());
            throw new NoSuchProviderException(sbA2.toString());
        }
    }

    public String getAlgorithm() {
        String str = this.algorithm;
        return str == null ? SSL.DEFAULT_SECURE_RANDOM_ALGORITHM : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }
}
