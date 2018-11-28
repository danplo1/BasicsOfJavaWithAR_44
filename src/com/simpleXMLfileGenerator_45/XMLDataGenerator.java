package com.simpleXMLfileGenerator_45;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel_D'AGE on 28.11.2018.
 */
public class XMLDataGenerator {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();

        for (int i = 0; i < 61; i++) {
            User user = new User();
            user.setEmail("testUser" + i + "@fromxml" + i + ".pl");
            user.setPassword("#TestPass" + i);
            user.setName("UserXML" + i);
            user.setLastName("UserXML" + i);
            user.setActive(1);
            user.setNrRoli(2);

            userList.add(user);

        }

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance(); // Factory baza do budowania nowego dokumentu
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder(); // budowniczy dokumentu

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("users"); // nowy rootelement
            doc.appendChild(rootElement); // dodajemy root element do naszego dokumentu, dorzucamy tagi <users> </users>

            for (int i = 0; i < userList.size(); i++) {
                Element user = doc.createElement("user");
                rootElement.appendChild(user); // <user> pomiedzy tagiwrzucamy poniżesze elementy </users>

                Element email = doc.createElement("email"); // tworzymy element
                email.appendChild(doc.createTextNode(userList.get(i).getEmail())); // dopisujemy wartość z listy
                user.appendChild(email); // odczytaną wartośc dorzucamy do elementu user

                Element password = doc.createElement("password");
                password.appendChild(doc.createTextNode(userList.get(i).getPassword()));
                user.appendChild(password);

                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(userList.get(i).getName()));
                user.appendChild(name);

                Element lastName = doc.createElement("lastName");
                lastName.appendChild(doc.createTextNode(userList.get(i).getLastName()));
                user.appendChild(lastName);

                Element active = doc.createElement("active");
                active.appendChild(doc.createTextNode(String.valueOf(userList.get(i).getActive())));
                user.appendChild(active);

                Element nrRoli = doc.createElement("nrRoli");
                active.appendChild(doc.createTextNode(String.valueOf(userList.get(i).getNrRoli())));
                user.appendChild(nrRoli);

            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance(); // konwertują zródło dokumentu
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\userdata.xml"));

            transformer.transform(source,result);

            System.out.println("Filed saved!");

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
/**

 <users>
        <user>
             <email>
                    <password>

                    </password>
             </email>
        </user>
 </users>

 */