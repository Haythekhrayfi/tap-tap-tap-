package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import defpackage.a;
import i.f;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes.dex */
public class SSLContextFactoryBean {
    private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
    private KeyManagerFactoryFactoryBean keyManagerFactory;
    private KeyStoreFactoryBean keyStore;
    private String protocol;
    private String provider;
    private SecureRandomFactoryBean secureRandom;
    private TrustManagerFactoryFactoryBean trustManagerFactory;
    private KeyStoreFactoryBean trustStore;

    private KeyManager[] createKeyManagers(ContextAware contextAware) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException {
        if (getKeyStore() == null) {
            return null;
        }
        KeyStore keyStoreCreateKeyStore = getKeyStore().createKeyStore();
        StringBuilder sbA = a.a("key store of type '");
        sbA.append(keyStoreCreateKeyStore.getType());
        sbA.append("' provider '");
        sbA.append(keyStoreCreateKeyStore.getProvider());
        sbA.append("': ");
        sbA.append(getKeyStore().getLocation());
        contextAware.addInfo(sbA.toString());
        KeyManagerFactory keyManagerFactoryCreateKeyManagerFactory = getKeyManagerFactory().createKeyManagerFactory();
        StringBuilder sbA2 = a.a("key manager algorithm '");
        sbA2.append(keyManagerFactoryCreateKeyManagerFactory.getAlgorithm());
        sbA2.append("' provider '");
        sbA2.append(keyManagerFactoryCreateKeyManagerFactory.getProvider());
        sbA2.append("'");
        contextAware.addInfo(sbA2.toString());
        keyManagerFactoryCreateKeyManagerFactory.init(keyStoreCreateKeyStore, getKeyStore().getPassword().toCharArray());
        return keyManagerFactoryCreateKeyManagerFactory.getKeyManagers();
    }

    private SecureRandom createSecureRandom(ContextAware contextAware) throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom secureRandomCreateSecureRandom = getSecureRandom().createSecureRandom();
        StringBuilder sbA = a.a("secure random algorithm '");
        sbA.append(secureRandomCreateSecureRandom.getAlgorithm());
        sbA.append("' provider '");
        sbA.append(secureRandomCreateSecureRandom.getProvider());
        sbA.append("'");
        contextAware.addInfo(sbA.toString());
        return secureRandomCreateSecureRandom;
    }

    private TrustManager[] createTrustManagers(ContextAware contextAware) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        if (getTrustStore() == null) {
            return null;
        }
        KeyStore keyStoreCreateKeyStore = getTrustStore().createKeyStore();
        StringBuilder sbA = a.a("trust store of type '");
        sbA.append(keyStoreCreateKeyStore.getType());
        sbA.append("' provider '");
        sbA.append(keyStoreCreateKeyStore.getProvider());
        sbA.append("': ");
        sbA.append(getTrustStore().getLocation());
        contextAware.addInfo(sbA.toString());
        TrustManagerFactory trustManagerFactoryCreateTrustManagerFactory = getTrustManagerFactory().createTrustManagerFactory();
        StringBuilder sbA2 = a.a("trust manager algorithm '");
        sbA2.append(trustManagerFactoryCreateTrustManagerFactory.getAlgorithm());
        sbA2.append("' provider '");
        sbA2.append(trustManagerFactoryCreateTrustManagerFactory.getProvider());
        sbA2.append("'");
        contextAware.addInfo(sbA2.toString());
        trustManagerFactoryCreateTrustManagerFactory.init(keyStoreCreateKeyStore);
        return trustManagerFactoryCreateTrustManagerFactory.getTrustManagers();
    }

    private KeyStoreFactoryBean keyStoreFromSystemProperties(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
        keyStoreFactoryBean.setLocation(locationFromSystemProperty(str));
        keyStoreFactoryBean.setProvider(System.getProperty(str + "Provider"));
        keyStoreFactoryBean.setPassword(System.getProperty(str + "Password"));
        keyStoreFactoryBean.setType(System.getProperty(str + "Type"));
        return keyStoreFactoryBean;
    }

    private String locationFromSystemProperty(String str) {
        String property = System.getProperty(str);
        return (property == null || property.startsWith("file:")) ? property : f.a("file:", property);
    }

    public SSLContext createContext(ContextAware contextAware) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException, CertificateException, NoSuchProviderException {
        SSLContext sSLContext = getProvider() != null ? SSLContext.getInstance(getProtocol(), getProvider()) : SSLContext.getInstance(getProtocol());
        StringBuilder sbA = a.a("SSL protocol '");
        sbA.append(sSLContext.getProtocol());
        sbA.append("' provider '");
        sbA.append(sSLContext.getProvider());
        sbA.append("'");
        contextAware.addInfo(sbA.toString());
        sSLContext.init(createKeyManagers(contextAware), createTrustManagers(contextAware), createSecureRandom(contextAware));
        return sSLContext;
    }

    public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
        KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean = this.keyManagerFactory;
        return keyManagerFactoryFactoryBean == null ? new KeyManagerFactoryFactoryBean() : keyManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getKeyStore() {
        if (this.keyStore == null) {
            this.keyStore = keyStoreFromSystemProperties(JSSE_KEY_STORE_PROPERTY);
        }
        return this.keyStore;
    }

    public String getProtocol() {
        String str = this.protocol;
        return str == null ? SSL.DEFAULT_PROTOCOL : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public SecureRandomFactoryBean getSecureRandom() {
        SecureRandomFactoryBean secureRandomFactoryBean = this.secureRandom;
        return secureRandomFactoryBean == null ? new SecureRandomFactoryBean() : secureRandomFactoryBean;
    }

    public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
        TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean = this.trustManagerFactory;
        return trustManagerFactoryFactoryBean == null ? new TrustManagerFactoryFactoryBean() : trustManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getTrustStore() {
        if (this.trustStore == null) {
            this.trustStore = keyStoreFromSystemProperties(JSSE_TRUST_STORE_PROPERTY);
        }
        return this.trustStore;
    }

    public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean) {
        this.keyManagerFactory = keyManagerFactoryFactoryBean;
    }

    public void setKeyStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.keyStore = keyStoreFactoryBean;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSecureRandom(SecureRandomFactoryBean secureRandomFactoryBean) {
        this.secureRandom = secureRandomFactoryBean;
    }

    public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean) {
        this.trustManagerFactory = trustManagerFactoryFactoryBean;
    }

    public void setTrustStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.trustStore = keyStoreFactoryBean;
    }
}
