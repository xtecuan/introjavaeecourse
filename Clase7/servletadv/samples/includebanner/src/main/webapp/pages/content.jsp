<pre>Redirection with web.xml and glassfish-web.xml

The web.xml and glassfish-web.xml files are used to accomplish JNDI redirection.  In general, inside of web.xml you specify what JNDI lookup your application will use to lookup a resource and then inside of glassfish-web.xml you map your application's lookup with the "JNDI Name" of the "JDBC Resource".  But with multiple context rules and automatic prepending of contexts, this too can get confusing so let's take a look at some examples.

Listing 1 shows a fully-qualified example.  In this example, the web.xml says the JNDI lookup used in your application is fully-qualified to "java:comp/email/database".  The glassfish-web.xml says "java:comp/email/database" is mapped to the real JNDI resource "EmailDS".
</pre>