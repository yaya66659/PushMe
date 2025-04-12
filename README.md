# PushMe
Compteur de click sur un bouton en architecture MVC.

# MVCpushMe

## 🎯 Objectif du projet

Ce projet Android a été développé dans le but de **montrer l'application de l'architecture MVC (Modèle - Vue - Contrôleur)** dans un projet Android Studio.

---

## 📱 Description

L'application **PushMe** propose une interface avec un bouton "Push Me". Chaque fois qu'on appuie sur le bouton :
- Un compteur s'incrémente,
- Un effet sonore est joué,
- Les données sont sauvegardées localement avec `SharedPreferences`.

Lorsque le nombre maximum est atteint, une **popup s'affiche**, et le compteur est remis à zéro.

---

## 🧠 Architecture utilisée : MVC

- **Modèle (`logique`)** : contient la logique métier (`PushMe`, `SaveAndLoad`, `EffetSonnore`, `LogiquePopup`)
- **Vue (`activity_main.xml`)** : interface utilisateur (UI)
- **Contrôleur (`ControlerPushMe`)** : gère les interactions entre la vue et le modèle
- **Affichage (`Affichages`)** : classe utilitaire pour mettre à jour l'UI ou afficher des popups

---

## 📂 Structure du projet

com/ └── yann/ └── pichat/ └── mvcpushme/ 
                                        ├── controller/ 
                                        ├── logique/ 
                                        ├── affichages/ 
                                        └── MainActivity.java


---

## 🔧 Outils et technologies

- **Java**
- **Android Studio**
- **API SharedPreferences**
- **Architecture MVC**

---

## 👤 Auteur

Projet réalisé par **Yann Pichat** — dans un but pédagogique.

---

## 📄 Licence

Ce projet est **libre et open-source** à des fins **non commerciales**.

> Vous pouvez utiliser, modifier et partager ce projet tant que vous :
> - **créditez l’auteur original**,
> - **ne l’utilisez pas à des fins commerciales**,
> - **publiez vos modifications sous la même licence**.

🔒 Licence : **Creative Commons Attribution - Pas d’Utilisation Commerciale 4.0 International (CC BY-NC 4.0)**  
🔗 [Lire la licence complète](https://creativecommons.org/licenses/by-nc/4.0/deed.fr)
