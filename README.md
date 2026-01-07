<div align="center">

# 🐳 Docker Practice Lab
### *Engineering Portability • Mastering Orchestration • Architecting Systems*

<p>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/Status-In%20Progress-green?style=for-the-badge" />
</p>

---



**[ 🚀 Explore Labs ](https://github.com/your-username/Docker-Practice) • [ 📝 Documentation ](#-key-concepts-mastered) • [ 📬 Contact ](#-author)**

</div>

---

## 🏛️ Project Architecture
This repository is organized into specialized modules designed to test specific Docker capabilities.

| Module | Focus Area | Key Tooling |
| :--- | :--- | :--- |
| **🔗 Bind Mounts** | Live-syncing dev environments | `volumes: - .:/app` |
| **📡 Inter-Container** | Backend-to-Backend REST calls | `Docker Bridge Net` |
| **☕ Java Microservices** | Compiling & Running JVM in Docker | `openjdk:17-slim` |
| **🌐 Web Applications** | Port mapping and Browser access | `8080:80` |

---

## 🛠️ The Interactive Lab Guide

### 📂 Explore the File System
<details>
<summary><b>Click to expand folder hierarchy</b></summary>

```text
Docker-Practice/
├── 📁 Docker Bind Mount/      # Demonstrates bind mounts & volumes
├── 📁 dockerFrom_to_container/# Container-to-container logic
├── 📁 Java/                   # Java app containerization
└── 📁 WEBAPP/                 # Web app examples

</details>

📡 Networking Deep-Dive
One of the core breakthroughs in this lab was moving away from localhost and mastering Docker DNS.

[!TIP] Key Insight: Containers on the same user-defined bridge network can reach each other using their Container Name as the hostname.

🧠 The Learning Log
1. Optimized Build Patterns
I follow a "Lean Image" philosophy to keep deployment fast and secure.

Dockerfile

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN javac App.java
CMD ["java", "App"]
2. Multi-Service Orchestration
Using Docker Compose to manage complex environments without the "Command-Line Bloat."

<details> <summary><b>View Sample Compose Logic</b></summary>

YAML

services:
  web:
    build: ./WEBAPP
    ports: ["80:80"]
  api:
    build: ./Java
    networks: [backend]

networks:
  backend:
    driver: bridge
</details>

🚀 Skills Mastery Dashboard
[x] Layer Caching: Understanding how to order Dockerfile commands to speed up builds.

[x] Container Lifecycle: Advanced management of ephemeral vs. persistent states.

[x] Service Discovery: Implementing internal communication via Docker DNS.

[ ] Next Step: Multi-stage builds for production-grade image sizes.

[ ] Next Step: Integrating persistent Database volumes (PostgreSQL/Redis).

👤 Author
<div align="center">

Suryansh Soni
Backend Engineer & Docker Practitioner

"Building, breaking, and fixing—one container at a time."

</div>

<div align="center"> <sub>© 2024 Suryansh Soni • Built for the community.</sub> </div>


-----

### Key Website-style Features Added:

1.  **Navigation Bar:** The bolded links at the top allow users to jump to sections just like a header menu.
2.  **Visual Hierarchy:** Used `###` for sub-headlines to create better vertical rhythm.
3.  **Thematic Icons:** Used consistent emojis (`🏛️`, `🛠️`, `🧠`, `🚀`) to act as visual anchors for each section.
4.  **GitHub Alerts:** Used the `> [!TIP]` syntax which renders as a color-coded callout box on GitHub.

**Would you like me to help you draft the "How to Run" section for a specific lab fold
