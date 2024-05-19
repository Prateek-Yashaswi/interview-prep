## Deployment Strategies

### Blue - Green Deployment

This deployment strategy involves running the new version of the software alongside the old version. Note that this is
also known as a red/black deployment strategy.

Stable or older versions of the application are always blue or red, while newer versions are green or black.

When the new version has been tested and certified to meet all the requirements, the load balancer automatically
switches traffic from the older version to the newer one.

In addition to offering a quick update or rollout of a new application version, this strategy has the disadvantage of
being expensive since both the new and old versions must run simultaneously.

### Canary Deployment

During canary deployment, the team responsible for deployment gradually redirects traffic from the older version to the
new one. For instance, at a certain stage in the process, 90% of production traffic may still go through the older
version while only 10% goes through the newer one. This approach allows DevOps engineers to evaluate the stability of
the new version by using live traffic from a subset of end-users at varying levels throughout production.

Canary Deployments enables better performance monitoring as well as faster and easier software rollbacks. However, it
has a slow deployment cycle and requires more time.

### Recreate Deployment

The development team shuts down the old version of the application completely, deploys the new version, then reboots the
whole system. This deployment method produces a system downtime between shutting down the old software and booting the
new one.

As there is no traffic shifting from one version to another in the live production environment, it requires no load
balancer.

The downtime in this strategy, however, affects the end user dramatically. Users must wait until the application is live
again to use it.

### Ramped Deployment / Rollout Deployment

The ramped deployment strategy gradually changes the older version to the new version. Unlike canary deployment, the
ramped deployment strategy replaces instances of the old application version with instances of the new application
version one instance at a time, as opposed to canary deployment. The rolling upgrade deployment strategy is another way
to refer to this method.

As soon as developers replace all instances of the older version, they shut it down. After that, the new version is in
charge of all production traffic.

The downgrading process to the initial version follows the same cycle, one instance at a time. However, the rollback
duration is long in case of an unexpected event.

### Shadow Deployment

In this deployment strategy, developers deploy the new version alongside the old version. However, users cannot access
the new version immediately. The latest version hides in the shadows. To test how the new version will handle the
requests when live, developers fork or copy a copy of the old version to the shadow version.

As a result, the DevOps engineer should be careful to ensure that the forked traffic does not create a duplicate live
request since two versions of the same system are running simultaneously.

It's expensive and complex to set up, and it can create serious problems. Shadow deployment allows engineers to monitor
system performance and conduct stability tests.

### A/B Testing Deployment

Developers deploy the new version alongside the older version in A/B testing deployment. However, this new version is
only available to a limited number of users, who are selected according to certain conditions and parameters. Location,
device type, UI language, and operating system can serve as parameters for selecting these users.