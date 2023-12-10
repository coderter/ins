import binascii

from Crypto.Cipher import PKCS1_OAEP
from Crypto.PublicKey import RSA

keyPair = RSA.generate(1024)

pubKey = keyPair.publickey()
print(f"Public key: (n={hex(pubKey.n)}, e={hex(pubKey.e)})")

pubKeyPEM = pubKey.exportKey()
print(pubKeyPEM.decode('ascii'))

privKey = keyPair
print(f"Public key: (n={hex(privKey.n)}, d={hex(privKey.d)})")

privKeyPEM = privKey.exportKey()
print(privKeyPEM.decode('ascii'))


msg = input("Enter a message:")
encryptor = PKCS1_OAEP.new(pubKey)

encrypted = encryptor.encrypt(msg.encode('utf-8'))
print("Encrypted: ", binascii.hexlify(encrypted))

decryptor = PKCS1_OAEP.new(privKey)
decrypted = decryptor.decrypt(encrypted)
print("Decrypted: ",decrypted.decode('utf-8'))


