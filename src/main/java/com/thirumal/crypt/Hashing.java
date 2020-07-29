/**
 * 
 */
package com.thirumal.crypt;

import java.util.function.Function;

import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 * @author Thirumal
 *
 */
public class Hashing {
	
    // {{start:bcrypt}}
    // This should be updated every year or two.
    private static final UpdatableBCrypt bcrypt = new UpdatableBCrypt(11);

    public static String hash(String password) {
        return bcrypt.hash(password);
    }

    public static boolean verifyAndUpdateHash(String password, String hash, Function<String, Boolean> updateFunc) {
        return bcrypt.verifyAndUpdateHash(password, hash, updateFunc);
    }
    // {{end:bcrypt}}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkPassword("thirumal", "$2a$10$7kRXkTmQ4bJiCQmRA7E0m.1J2/hN/ewHI9XgmtsSWqtJB08JY4GZO"));
		  // {{start:bcryptMain}}
        // Mini function to test updates.
      //  String[] mutableHash = new String[1];
       // Function<String, Boolean> update = hash -> { mutableHash[0] = hash; return true; };
		String indsolvHash = "$2a$11$yxxSL68czCwdBzWav0m49epqzC.vbVuCazflJDDbrrh7j7BHjGdze";
        String hashPw1 = Hashing.hash("VY Canis Majoris");
        System.out.println("hash of VY Canis Majoris: " + hashPw1);
        
        String hashEnkindle1 = Hashing.hash("Enkindle1!");
        System.out.println("Enkindle1!: " + hashPw1);
        System.out.println("Enkindle1! Equals: " + checkPassword("Enkindle1!", hashEnkindle1));
        
        System.out.println("Indsolv Equals: " + checkPassword("indsolv", indsolvHash));
       // log.info("hash of pw1: {}", hashPw1);
        //log.debug("verifying pw1: {}", Hashing.verifyAndUpdateHash("password", hashPw1, update));
        //log.debug("verifying pw1 fails: {}", Hashing.verifyAndUpdateHash("password1", hashPw1, update));
        String hashPw2 = Hashing.hash("thirumal");
        System.out.println("hash of thirumal: " + hashPw2);
        System.out.println("Thirumal Equals: " + checkPassword("thirumal", hashPw2));
        //log.debug("hash of pw2: {}", hashPw2);
        //log.debug("verifying pw2: {}", Hashing.verifyAndUpdateHash("password", hashPw2, update));
       // log.debug("verifying pw2 fails: {}", Hashing.verifyAndUpdateHash("password2", hashPw2, update));

        UpdatableBCrypt oldHasher = new UpdatableBCrypt(7);
        String oldHash = oldHasher.hash("indsolv");
        System.out.println("hash of oldHash: " + oldHash);
        //log.debug("hash of oldHash: {}", oldHash);
        //log.debug("verifying oldHash: {}, hash upgraded to: {}",
               //   Hashing.verifyAndUpdateHash("password", oldHash, update),
                 // mutableHash[0]);
        // {{end:bcryptMain}}
        String admin = Hashing.hash("admin");
        System.out.println("hash of admin: " + admin);
	}
	
	public static boolean checkPassword(String passwordPlaintext, String passwordHash) {
		boolean password_verified = false;

		if(null == passwordHash || !passwordHash.startsWith("$2a$"))
			throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

		password_verified = BCrypt.checkpw(passwordPlaintext, passwordHash);

		return(password_verified);
}

}
