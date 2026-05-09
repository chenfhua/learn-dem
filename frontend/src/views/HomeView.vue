<template>
  <div class="home">
    <el-card class="welcome-card">
      <template #header>
        <div class="card-header">
          <el-icon size="24"><HomeFilled /></el-icon>
          <span>欢迎使用 Demo 全栈应用</span>
        </div>
      </template>
      <div class="content">
        <p>这是一个基于 <strong>Spring Boot 3 + Vue 3</strong> 的前后端分离项目示例。</p>
        <el-divider />
        <el-row :gutter="20">
          <el-col :span="12">
            <el-card shadow="hover">
              <template #header>后端技术栈</template>
              <ul>
                <li>Spring Boot 3.x</li>
                <li>Java 21</li>
                <li>Spring Data JPA</li>
                <li>H2 内存数据库</li>
                <li>Lombok</li>
              </ul>
            </el-card>
          </el-col>
          <el-col :span="12">
            <el-card shadow="hover">
              <template #header>前端技术栈</template>
              <ul>
                <li>Vue 3 (Composition API)</li>
                <li>TypeScript</li>
                <li>Element Plus UI</li>
                <li>Vue Router</li>
                <li>Axios</li>
              </ul>
            </el-card>
          </el-col>
        </el-row>
        <el-divider />
        <el-button type="primary" @click="$router.push('/users')">
          <el-icon><User /></el-icon>
          查看用户列表
        </el-button>
      </div>
    </el-card>
  </div>
</template>

<script setup lang="ts">
</script>

<style scoped>
.home {
  padding: 20px;
}

.welcome-card {
  max-width: 900px;
  margin: 0 auto;
}

.card-header {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 18px;
  font-weight: bold;
}

.content {
  line-height: 1.8;
}

.content ul {
  padding-left: 20px;
}

.content li {
  margin-bottom: 8px;
}
</style>
