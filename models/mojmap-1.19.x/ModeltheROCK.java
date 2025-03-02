// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModeltheROCK<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "therock"), "main");
	private final ModelPart bone13;

	public ModeltheROCK(ModelPart root) {
		this.bone13 = root.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
						.addBox(-1.5F, -13.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 19)
						.addBox(0.5F, -10.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 11)
						.addBox(0.5F, -14.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 11)
						.addBox(-1.5F, -12.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 23)
						.addBox(-2.0F, -12.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 29)
						.addBox(-2.0F, -11.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(0.0F, -13.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 25)
						.addBox(0.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone12 = bone13.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(36, 17)
						.addBox(2.5F, -38.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 23)
						.addBox(2.0F, -37.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone11 = bone13.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(36, 15)
						.addBox(2.5F, -37.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 29)
						.addBox(2.0F, -36.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone10 = bone13.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(36, 13)
						.addBox(2.5F, -39.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(2.0F, -38.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone9 = bone13.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(36, 5)
						.addBox(0.5F, -36.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 5)
						.addBox(0.0F, -35.0F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone8 = bone13.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(36, 0)
						.addBox(-1.5F, -38.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 16)
						.addBox(-2.0F, -37.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone7 = bone13.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(20, 34)
						.addBox(-4.0F, -34.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 33)
						.addBox(-3.5F, -35.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone6 = bone13.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(34, 11)
						.addBox(-3.5F, -38.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-4.0F, -37.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = bone13.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(30, 21)
						.addBox(-3.5F, -39.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-4.0F, -38.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone4 = bone13.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(28, 29)
						.addBox(-3.5F, -37.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
						.addBox(-4.0F, -36.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone3 = bone13.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(20, 29)
						.addBox(-1.5F, -38.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 18)
						.addBox(-2.0F, -37.0F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = bone13.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(26, 11)
						.addBox(0.5F, -36.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(0.0F, -35.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = bone13.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 23)
						.addBox(2.5F, -39.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -38.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rock = bone13.addOrReplaceChild("rock",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(-3.0F, -33.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 35)
						.addBox(-5.0F, -33.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-5.0F, -33.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 23)
						.addBox(4.0F, -33.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 19)
						.addBox(4.0F, -33.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 34)
						.addBox(-1.0F, -33.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 35)
						.addBox(2.0F, -33.0F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = rock.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 17).addBox(-7.0F, -32.5F, -2.5F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 1.0F, 0.0033F, -0.1493F, 0.0349F));

		PartDefinition cube_r2 = rock.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 30).addBox(-15.0F, -30.25F, -2.5F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 1.0F, -0.0293F, -0.1465F, 0.2555F));

		PartDefinition cube_r3 = rock.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 8).addBox(-16.0F, -29.75F, -0.75F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 1.0F, -0.0298F, -0.2337F, 0.2581F));

		PartDefinition cube_r4 = rock.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(6, 0).addBox(17.0F, -29.0F, 1.4F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 1.0F, 0.0298F, 0.2337F, -0.2581F));

		PartDefinition cube_r5 = rock.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 32).addBox(14.0F, -29.75F, 0.25F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0293F, 0.1465F, -0.2555F));

		PartDefinition cube_r6 = rock.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(28, 33).addBox(6.0F, -32.25F, -1.5F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0033F, 0.1493F, -0.0349F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}