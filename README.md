[![Coverage Status](https://coveralls.io/repos/github/idtrust/icarta-java-sdk/badge.svg?branch=master)]
(https://coveralls.io/github/idtrust/icarta-java-sdk?branch=master)

#Como integrar o icarta-java-sdk com sua aplicação:
==========

A implementação é bem simples, insira essa parte de código no seu sistema e altere os campos necessários.

            TrackedEmail trackedEmail = new TrackedEmail()
                    .from("from@email.com")
                    .withUniqueId(UUID.randomUUID().toString())
                    .withSubject("Meu Assunto")
                    .withMessage("Meu texto do email")
                    .to("to@email.com")
                    .withCC("copia@email.com")
                    .withCC("copia2@email.com")
                    .withBCC("oculta@email.com")
                    .withAttachment("teste.txt", "text/plain",
                            new String("algum texto").getBytes());

            ICartaService service = new ICartaService(new ICartaCredentials(
                    "ffc28ec6db63ed83aa785646409bad94",
                    "b3f8d6a3-5c81-a7fd-39e6-a49333fef107"));
            service.send(trackedEmail);


- o valor do método "withUniqueId" é criado pelo cliente, pois é a chave única de identificação para retorno das evidências.
- os anexos ("withAttachment") pode ser qualquer formato (pdf, txt, xml, etc), porém é necessário passar o Content-Type correto do arquivo.

As credencias são fornecidas pela iDtrust (http://idtrust.com.br)

            
