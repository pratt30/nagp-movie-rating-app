#NAGP-MOVIE_RATING_ANALYTICS - Kubernetes, DevOps & FinOps Assignment

## Project Overview

This project demonstrates a multi-tier application deployed on Kubernetes as part of the NAGP 2026 Kubernetes, DevOps & FinOps Home Assignment.

The solution consists of:

- Movie Rating Service (Spring Boot Microservice)
- MySQL Database
- Docker Containerization
- Kubernetes Deployments and Services
- ConfigMaps and Secrets
- Persistent Storage for Database
- Ingress for External Access
- HPA
- Self-Healing and Rolling Updates

---

## Code Repository

GitHub Repository:

**Repository URL:**  
https://github.com/pratt30/nagp-movie-rating-app

---

## Docker Images

Docker Hub Repository:

**Docker Hub URL:**  
https://hub.docker.com/repository/docker/debolina30/movie-rating-service

Docker Image:

```bash
docker pull debolina30/movie-rating-service:v2
```

---

## Service API Endpoint

The application is exposed externally through Kubernetes Ingress.

**Application URL:**

http://34.8.114.17/api/movies

Sample Response:

```json
[{"id":1,"movieName":"Interstellar","genre":"Sci-fi","rating":4.8,"reviewCount":10000},{"id":2,"movieName":"Inception","genre":"Sci-fi","rating":4.7,"reviewCount":78000},{"id":3,"movieName":"Avatar","genre":"Fantacy","rating":4.5,"reviewCount":66666}]
```
---

## Kubernetes Features Implemented

### Service API Tier

- 4 Replicas
- Rolling Updates Enabled
- Externally Accessible via Ingress
- ConfigMap Usage
- Secret Usage
- HPA
- Self-Healing Demonstration

### Database Tier

- MySQL Database
- Persistent Volume Claim (PVC)
- Internal Cluster Access Only
- Kubernetes Secret for Credentials
- Data Persistence Across Pod Recreation

---

## Configuration Management

### ConfigMap

Used for:

- Database Host
- Database Name
- Database Port

### Secrets

Used for:

- MySQL Username
- MySQL Password

---

## FinOps Considerations

Implemented:

- CPU Requests and Limits
- Memory Requests and Limits
- Horizontal Pod Autoscaler
- Resource Right-Sizing Based on Observed Metrics

Cost Optimization Opportunities:

1. Right-size CPU and Memory requests.
2. Use HPA to scale based on demand.
3. Use smaller node pools for non-production workloads.
4. Clean up unused resources after testing.
5. Use persistent storage only where required.

---

## Deployment Verification

The demonstration video covers:

- Kubernetes Objects Deployment
- API Access Through Ingress
- Database Connectivity
- Self-Healing of API Pods
- Self-Healing of Database Pod
- Persistent Data Validation
- Rolling Update Demonstration
- HPA Demonstration
- FinOps Optimization Discussion
